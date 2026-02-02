package Teleops;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Basic Drive Train", group = "Basic")
public class BasicDriveTrainTeleop extends OpMode {

    @Override
    public void init() {
        telemetry.addLine("Initialized");
        telemetry.update();
    }

    @Override
    public void start() {
        telemetry.addLine("Started");
        telemetry.update();
    }

    @Override
    public void loop() {
        telemetry.addLine("Running");
        telemetry.update();
    }


}
