public class ScienceMathematicsStrategy implements ExamStrategy {
    @Override
    public EnumLesson getFirst() {

        return EnumLesson.MATHS;
    }

    @Override
    public EnumLesson getSecond() {

        return EnumLesson.TURKISH;
    }

    @Override
    public EnumLesson getThird() {
        return EnumLesson.SCIENCE;
    }

    @Override
    public EnumLesson getFourth() {

        return EnumLesson.SOCIAL;
    }
}
