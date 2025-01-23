public class Module {
    private String modName;
    private String modCode;
    private int modAssignmentMarks;
    private int modExamMarks;
    private int modTotalMarks;

    public Module(String modName, String modCode, int modAssignmentMarks, int modExamMarks) {
        this.modName = modName;
        this.modCode = modCode;
        this.modAssignmentMarks = modAssignmentMarks;
        this.modExamMarks = modExamMarks;
        this.modTotalMarks = modAssignmentMarks + modExamMarks;
    }
}
