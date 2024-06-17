public interface WorkflowManagement {

    void addStaff(Staff sf);


    void displaysAListToStaff();
    void repairStaff(String[] employeeInfo);
    void repairStaff(String Code,String Phone,String Name,String Position,String FactoryCode,String Type);
    boolean isEmployeeExist(String Code);


    boolean deleteStaff(String Code);



}
