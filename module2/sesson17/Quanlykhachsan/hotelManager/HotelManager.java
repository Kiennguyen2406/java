package hotelManager;

import room.Room;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class HotelManager {

    List<Room> rooms = new ArrayList<>();

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public int searchByNumberRoom(int numberRoom) {
        for (int i = 0; i < rooms.size(); i++) {
            if (rooms.get(i).getNumberRoom() == numberRoom) {
                return i;
            }
        }
        return -1;
    }

    public void repairRoomByNumberRoom(int numberRoom, String typeRoom, double priceRoom, String roomCondition) {
        if (searchByNumberRoom(numberRoom) == -1) {
            System.out.println("Không tìm thấy so phong phu hop de sua");
        } else {
            rooms.get(searchByNumberRoom(numberRoom)).setTypeRoom(typeRoom);
            rooms.get(searchByNumberRoom(numberRoom)).setPriceRoom(priceRoom);
            rooms.get(searchByNumberRoom(numberRoom)).setRoomCondition(roomCondition);
        }
    }

    public void deleteRoomByNumberRoom(int numberRoom) {
        if (searchByNumberRoom(numberRoom) == -1) {
            System.out.println("Không tìm thấy so phong de xoa  ");
        } else {
            rooms.remove(searchByNumberRoom(numberRoom));
        }
    }

    public void showList() {
        for (int i = 0; i < rooms.size(); i++) {
            System.out.println(rooms.get(i));
        }
    }

    public void saveFileText() {
        try {
            File file = new File("data.txt");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < rooms.size(); i++) {
                Room room = rooms.get(i);
                String dataRoom= room.getNumberRoom() + "," + room.getTypeRoom() + "," + room.getPriceRoom() + "," + room.getRoomCondition();
                bufferedWriter.write(dataRoom);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void readFileText() {
        try {
            File file = new File("data.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = "";
            ;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                int numberRoom = Integer.parseInt(data[0]);
                String typeRoom = data[1];
                double priceRoom = Double.parseDouble(data[2]);
                String roomCondition = data[3];
               Room room = new Room(numberRoom, typeRoom, priceRoom, roomCondition);
                rooms.add(room);
            }
            bufferedReader.close();
            System.out.println("Đã lay du lieu tu file xuống");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}



