public class BalancedStrategy implements ExamStrategy {
    @Override
    public EnumLesson getFirst() {
        return EnumLesson.TURKISH;

    }

    @Override
    public EnumLesson getSecond() {
        return EnumLesson.MATHS;

    }

    @Override
    public EnumLesson getThird() {

        return EnumLesson.SOCIAL;
    }

    @Override
    public EnumLesson getFourth() {

        return EnumLesson.SCIENCE;
    }
}
