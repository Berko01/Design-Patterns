public class LanguageHumanitiesStrategy implements ExamStrategy{

    @Override
    public EnumLesson getFirst() {
        return EnumLesson.TURKISH;
    }

    @Override
    public EnumLesson getSecond() {
        return EnumLesson.SOCIAL;
    }

    @Override
    public EnumLesson getThird() {
        return EnumLesson.MATHS;
    }

    @Override
    public EnumLesson getFourth() {
        return EnumLesson.SCIENCE;
    }

}
