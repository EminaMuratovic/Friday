
public class Temperature {
	double temp;
	char letter;
	
	//konstruktori:
	
	/**
	 * creates an object without parameters, makes default parameters
	 */
	public Temperature() {
		this(0, 'K');
	}
	/**
	 * creates an object with all of the parameters
	 * @param temp double given temperature
	 * @param letter char K-Kelvin, F-Fahrenheit or C-Celsius
	 */
	public Temperature(double temp, char letter) {
		this.temp = temp;
		this.letter = letter;
	}
	
	//konstruktor kopije:
	
	/**
	 *  copies one object to another
	 * @param other Temperature object the we want to copy
	 */
	public Temperature(Temperature other) {
		this.temp = other.temp;
		this.letter = other.letter;
	}
	
	//geteri:
	
	/**
	 * gets the temperature in Celsius
	 * @return  temperature in Celsius
	 */
	public double getCelsius(char letter) {
		if(letter == 'F')
			return (temp - 32) * 5 / 9;
		if(letter == 'K')
			return temp - 273.15;
		else
			return temp;
	}
	/**
	 * gets the temperature in Fahrenheit
	 * @return  temperature in Fahrenheit
	 */
	public double getFahrenheit(char letter) {
		if(letter == 'C')
			return temp * 9 / 5 +32;
		if(letter == 'K')
			return temp * 9 / 5 - 459.67;
		else
			return temp;
	}
	/**
	 * gets the temperature in Kelvin
	 * @return  temperature in Kelvin
	 */
	public double getKelvin(char letter) {
		if(letter == 'F')
			return (temp + 459.67) * 5 / 9;
		if(letter == 'C')
			return temp + 279.15;
		else
			return temp;
	}
	/**
	 * gets the letter for Celsius
	 * @return 'C'
	 */
	public char getCelsiusLetter() {
		return 'C';
	}
	/**
	 * gets the letter for Kelvin
	 * @return 'K'
	 */
	public char getKelvinLetter() {
		return 'K';
	}
	/**
	 * gets the letter for Fahrenheit
	 * @return 'F'
	 */
	public char getFahrenheitLetter() {
		return 'F';
	}
	
	//seteri:
	
	/**
	 * sets the given temperature in Celsius
	 * @param temp double given temperature
	 * @return temperature
	 */
	public boolean setCelsius(double temp) {
		if(temp < -273.15)
			return false;
		else {
			this.temp = temp;
			return true;
		}
	}
	/**
	 * sets the given temperature in Kelvin
	 * @param temp double given temperature
	 * @return temperature
	 */
	public boolean setKelvin(double temp) {
		if(temp < 0)
			return false;
		else {
			this.temp = temp;
			return true;
		}
	}
	/**
	 * sets the given temperature in Fahrenheit
	 * @param temp double given temperature
	 * @return temperature
	 */
	public boolean setFahrenheit(double temp) {
		if(temp < -459.67)
			return false;
		else {
			this.temp = temp;
			return true;
		}
	}
	
	//pretvaranje u string:
	
	/**
	 * returns a string representation of the object
	 */	
	public String toString() {
		String str = "";
		str = temp + " " + letter;
		return str;
	}
	
	
	
}
