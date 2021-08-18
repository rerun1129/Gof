package COR;

public abstract class Calculator {

    private Calculator nextCalculator;

    public void setNextCalculator(Calculator nextCalculator) {
        this.nextCalculator = nextCalculator;
    }

    public boolean process(Request request) {

        if (operator(request)) {        //처리를 해봄
            return true;
        } else {                        //안돼면
            if (nextCalculator != null) //넘길 클래스가 null 이 아닌 경우 다음으로 넘긴다.
                return nextCalculator.operator(request);
        }
        return false;

        // if (preCaculator != null)
        // if(preCaculator.process(request))
        // return true;
        //
        // return operator(request);
    }

    abstract protected boolean operator(Request request);

}
