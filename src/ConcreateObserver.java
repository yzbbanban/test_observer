public class ConcreateObserver implements Observe {
    private String observerState;
    @Override
    public void updata(Subject subject) {
        observerState=((ConcreateSubject)subject).getSubjectState();

    }
}
