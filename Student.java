package BTHamic_Tuan4;

public class Student {
    private String id,name,birth,gender,address;
    public Student(){

    }
    
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getBirth(){
        return birth;
    }
    public String getAddress(){
        return address;
    }
    public String getGender(){
        return gender;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setBirth(String birth){
        this.birth = birth;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String toString(){
        String s = "Student[ID="+id+", Name="+name
        +", Birth="+birth+", Gender="+gender+", Address="+address+"]";
        return s;
    }

}
