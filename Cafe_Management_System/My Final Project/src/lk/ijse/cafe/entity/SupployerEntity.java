package lk.ijse.cafe.entity;

public class SupployerEntity implements SupperEntity{
    private String supplyer_id;
    private String name;
    private String address;

    public SupployerEntity() {
    }

    public SupployerEntity(String supplyer_id) {
        this.supplyer_id = supplyer_id;
    }

    public SupployerEntity(String supplyer_id, String name, String address) {
        this.supplyer_id = supplyer_id;
        this.name = name;
        this.address = address;
    }

    public String getSupplyer_id() {
        return supplyer_id;
    }

    public void setSupplyer_id(String supplyer_id) {
        this.supplyer_id = supplyer_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "SupployerEntity{" +
                "supplyer_id='" + supplyer_id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
