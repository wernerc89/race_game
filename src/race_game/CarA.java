package race_game;

public class CarA implements Car {

	// declare variables
	public String carName = "A";
	public Integer acceleration = 5;
	public Integer topSpeed = 10;
	public Integer cornering = 2;
	public Integer currentSpeed = 0;
	public Integer addSpeed = 0;

	// initialize constructor
	public CarA() {

	}

	// getter and setters methods
	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public Integer getAcceleration() {
		return acceleration;
	}

	public void setAcceleration(Integer acceleration) {
		this.acceleration = acceleration;
	}

	public Integer getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(Integer topSpeed) {
		this.topSpeed = topSpeed;
	}

	public Integer getCornering() {
		return cornering;
	}

	public void setCornering(Integer cornering) {
		this.cornering = cornering;
	}

	// method to handle car values based on track param
	public void accelarate(int accType) {
		if (accType == 0) {

			if (currentSpeed == 0) {
				addSpeed = acceleration;
			} else if (currentSpeed == topSpeed) {
				addSpeed = topSpeed;
			} else if (currentSpeed < topSpeed) {
				if ((currentSpeed + acceleration) == topSpeed) {
					addSpeed = topSpeed;
				} else {
					addSpeed = currentSpeed + acceleration;
					if (addSpeed > topSpeed) {
						addSpeed = topSpeed;
					}
				}
			} else if (currentSpeed > topSpeed) {
				addSpeed = topSpeed;
			} else if ((currentSpeed + acceleration) >= topSpeed) {
				addSpeed = topSpeed;
			}

			currentSpeed = currentSpeed + addSpeed;
		} else if (accType == 1) {

			currentSpeed = currentSpeed + cornering;
		}
	}

}
