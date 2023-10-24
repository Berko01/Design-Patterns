public class Student {

    private EnumTrack track;
    private ExamStrategy examStrategy;

    public Student(EnumTrack track) {
        this.track = track;

        if (track == null) {
            throw new NullPointerException("Bölüm boş olamaz!");
        }

        switch (track) {
            case LANGUAGEHUMANITIES:
                examStrategy = new LanguageHumanitiesStrategy();
                break;

            case BALANCED:
                examStrategy = new BalancedStrategy();
                break;

            case SCIENCEMATHEMATICS:
                examStrategy = new ScienceMathematicsStrategy();
                break;

            default:
                break;
        }
    }

    public String getPriorityOrder() {

        System.out.println(track + " için strateji: ");

        String order = "Önce " + examStrategy.getFirst() + " çöz. \n" +
                "Sonra " + examStrategy.getSecond() + " çöz. \n" +
                "Daha sonra " + examStrategy.getThird() + " çöz. \n" +
                "Zaman kalırsa " + examStrategy.getFourth() + " çözersin. \n";

        return order;
    }
}
