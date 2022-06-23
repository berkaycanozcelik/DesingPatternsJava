public class Duck implements IDisplayStrategy, IFlyStrategy, IQuackStrategy {

    private IFlyStrategy fs;
    private  IDisplayStrategy ds;
    private  IQuackStrategy qs;

    public Duck(IFlyStrategy fs, IDisplayStrategy ds, IQuackStrategy qs) {
        this.fs = fs;
        this.ds = ds;
        this.qs = qs;
    }

    @Override
    public String display() {
        return ds.display();
    }

    @Override
    public String fly() {
        return fs.fly();
    }

    @Override
    public String quack() {
        return qs.quack();
    }
}
