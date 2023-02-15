package zoo;

public abstract class Animal implements Sayable {
    private String name;

    protected Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract String feed();

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        if(this instanceof Runable){

            str.append(" скорость бега- > " + ((Runable) this).getSpeedRun());
        }

        if(this instanceof Flyable){

            str.append(" скорость полета- > " + ((Flyable) this).getSpeedFlyable());
        }

        if(this instanceof Flyable){

            str.append(" высота полета- > " + ((Flyable) this).getHightFlyable());
        }

        if(this instanceof Swimable){

            str.append(" скорость плавания- > " + ((Swimable) this).getSpeedSwimable());
        }


        return String.format(str + " %s ест %s", this.name, this.feed());
    }
}
