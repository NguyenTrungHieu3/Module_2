package case_study.student_management.model.entity;

public class TrialStudent extends Student {
    private int trialDays;

    public TrialStudent() {
        super();
        this.trialDays = 0;
    }

    public TrialStudent(int trialDays) {
        super();
        this.trialDays = trialDays;
    }

    public TrialStudent(String studentId, String name, String email, String phone, String birthday, int trialDays) {
        super(studentId, name, email, phone, birthday);
        this.trialDays = trialDays;
    }

    public int getTrialDays() {
        return trialDays;
    }

    public void setTrialDays(int trialDays) {
        this.trialDays = trialDays;
    }

    @Override
    public String toString() {
        return "Trial Student: \n"
                +super.toString()
                + "Trial days: " + this.trialDays + "\n";
    }

    @Override
    public String getInfoToCSV() {
        return this.getId()
                + "," + this.getStudentId()
                + "," + this.getName()
                + "," + this.getEmail()
                + "," + this.getPhone()
                + "," + this.getBirthday()
                + "," + this.trialDays;
    }
}
