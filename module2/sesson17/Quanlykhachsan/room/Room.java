package room;

public class Room {
    private int numberRoom;
    private String typeRoom;
    private double priceRoom;
    private String roomCondition;

    public Room() {
    }

    public Room(int numberRoom, String typeRoom, double priceRoom,String roomCondition) {
        this.numberRoom = numberRoom;
        this.priceRoom = priceRoom;
        this.typeRoom = typeRoom;
        this.roomCondition=roomCondition;
    }

    public String getRoomCondition() {
        return roomCondition;
    }

    public void setRoomCondition(String roomCondition) {
        this.roomCondition = roomCondition;
    }

    public int getNumberRoom() {
        return numberRoom;
    }


    public void setNumberRoom(int numberRoom) {
        this.numberRoom = numberRoom;
    }

    public String getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }

    public double getPriceRoom() {
        return priceRoom;
    }

    public void setPriceRoom(double priceRoom) {
        this.priceRoom = priceRoom;
    }

    @Override
    public String toString() {
        return "room.Room{" +
                "numberRoom=" + numberRoom +
                ", typeRoom='" + typeRoom + '\'' +
                ", priceRoom=" + priceRoom +
                ", roomCondition='" + roomCondition + '\'' +
                '}';
    }
}

