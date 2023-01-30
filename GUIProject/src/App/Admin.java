package App;
public class Admin extends User{
    private boolean isManager = false;
    private String adminFirstName;
    private String adminLastName;

    public void setAdminFirstName(String adminFirstName) {
        this.adminFirstName = adminFirstName;
    }

    public void setAdminLastName(String adminLastName) {
        this.adminLastName = adminLastName;
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public void setIsManager(boolean isManager) {
        this.isManager = isManager;
    }

    @Override
    public void setPassword(String password) {
        super.setPassword(password); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        super.setPhoneNumber(phoneNumber); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setUsername(String username) {
        super.setUsername(username); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public String getAdminFirstName() {
        return adminFirstName;
    }

    public String getAdminLastName() {
        return adminLastName;
    }

    @Override
    public String getEmail() {
        return super.getEmail(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getPassword() {
        return super.getPassword(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getPhoneNumber() {
        return super.getPhoneNumber(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getUsername() {
        return super.getUsername(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    //public void addNewFlight(){}
    //public void deleteFlight(){}
    //public void updateFlight(){}
}
