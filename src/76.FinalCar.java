class FinalCar {
    final int noOfWheels;
    final String model;
    final String fuelType;

    FinalCar(int noOfWheels, String model, String fuelType){
        this.noOfWheels = noOfWheels;
        this.model = model;
        this.fuelType=fuelType;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FinalCar{");
        sb.append("noOfWheels=").append(noOfWheels);
        sb.append(", model='").append(model).append('\'');
        sb.append(", fuelType='").append(fuelType).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args){
        FinalCar ob = new FinalCar(4,"swift", "petrol");
        System.out.println(ob);// 1 object with different value but fixed and final
        FinalCar ob2 = new FinalCar(8,"oddy", "petrol");
        System.out.println(ob2);// 2 object with different value but fixed and final
    }
}