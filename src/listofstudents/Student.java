package listofstudents;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shaim
 */
public class Student {
  private String name;
  private int id;
  private String DOB;
  
  public Student()
  {
       this.id =0;
       this.name = "Not Set";
  }
  
  public Student(String givenName, int givenId)
  {
      this.name = givenName;
      this.id = givenId;
  }
  
  public void setName (String givenName)
  {
      this.name = givenName;
  }
  public String getName()
  {     
      return name;
  }
  
  public void setId(int givenId)
  {
      this.id = givenId;
  }

    /**
     *
     * @return
     */
    public int getId()
  {
      return id;
  }

    /**
     * @return the DOB
     */
    public String getDOB() {
        return DOB;
    }

    /**
     * @param DOB the DOB to set
     */
    public void setDOB(String DOB) {
        this.DOB = DOB;
    }
  
}
