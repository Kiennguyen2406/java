public interface WorkflowManagement {

    void AddStaff(Staff sf);


    void DisplaysALisTofEmployees();
    void RepairStaff(String Code,String Phone,String Name,String Position);
    void RepairStaff(String Code,String Phone,String Name,String Position,String FactoryCode,String Type);


    void DeleteStaff(String Code);

}
