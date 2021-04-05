class ControlPanelTest {
    public static void main(String[] args) {
        new com.company.ControlPanel().control();
    }
}

class Altimeter{
    @Override
    public String toString() {
        return "Measure height";
    }
}
class AirGauge{
    @Override
    public String toString() {
        return "Measure air pressure";
    }
}

class ControlPanel{
    private com.company.Altimeter altimeter = new com.company.Altimeter();
    private com.company.AirGauge airGauge = new com.company.AirGauge();

    public void control() {
        System.out.println(altimeter);
        System.out.println(airGauge);
    }

}