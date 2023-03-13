package com.example.mathcompetencysurvey;

public class Ministry {
    private String ministryname;
    // attributes
    private String year;
    private static String ministryname;
    private DSchoolList schoollist;
    private String pic;

    public Ministry(String pic) {
        this.pic = pic;
    }

    public String getMinistryname() {
        return ministryname;
    }

    public void setMinistryname(String ministryname) {
        this.ministryname = ministryname;
    }

    public DSchoolList getSchoollist() {
        return schoollist;
    }

    public void setSchoollist(DSchoolList schoollist) {
        this.schoollist = schoollist;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public static void main(String args[]) {
        //Ministry.ministryname="MOE";
        
        //application test code
        Ministry min1= new Ministry ("Damia");
        min1.setMinistryname("MOE');
        min1.setYear("2022");
                             
        Ministry min2= new Ministry ("Nisa");
        min2.setMinistryname("MOE");
        min2.setYear("2023");                    
                             
                             


    }
}
