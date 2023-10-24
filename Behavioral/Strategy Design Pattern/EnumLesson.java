public enum EnumLesson {
    TURKISH("Turkce"),
    MATHS("Matematik"),
    SCIENCE("Fen"),
    SOCIAL("Sosyal");

    private String lesson;

    EnumLesson(String lesson){
        this.lesson = lesson;
    }

    public String toString(){
        return lesson;
    }

}
