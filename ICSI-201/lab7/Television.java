package lab7;
//Michael Sollazzo
//Lab section Fri8:15
//The purpose of this class is to model a television

public class Television
{
private	String MANUFACTURER = ""; // holds the brand name
private	int SCREEN_SIZE = 0; // holds the screen size of the television
private	boolean powerOn = false; // hold value for on or off 
private	int volume = 20; // hold value representing sound
private	int channel = 2; // hold value representing station 

/**
 * This method creates and instance of Television.
 * @param t The manufacturer of the television.
 * @param s The size of the television.
 */

 public Television(String t, int s )
 {
	MANUFACTURER = t;
	SCREEN_SIZE = s;	
 }

/**
 * This method returns the value stored in the volume field.
 * @return The volume.
 */

 public int getVolume()
 {
	return volume;
 }

/**
 * This method returns the value stored in the channel field.
 * @return The channel.
 */

 public int getChannel() 
 {
	
	return channel;
 }

/**
 * This method returns the constant value stored in the MANUFACTURER field.
 * @return The manufacturer. 
 */

 public String getManufacturer()
 {
	return MANUFACTURER;
 }

/**
 * This method returns the constant value stored in the SCREEN_SIZE field. 
 * @return The screen size.
 */

 public int getScreenSize()
 {	
	return SCREEN_SIZE;
 }

/**
 * This method will store the desired station in the channel field. 
 * @param c The channel.
 */

 public void setChannel(int c)
 {
	channel = c;
 }

/**
 * This method toggles the power between on and off, changing the value stored in the powerOn field from true to false or from false to true. 
 */

 public void power()
 {
	 powerOn = !powerOn;
 }	

/**
 * This method increases the value stored in the volume field by 1. 
 */

 public void increaseVolume() 
 { 
	volume++;
 }

/**
 * This method decreases the value stored in the volume field by 1. 
 */

 public void decreaseVolume()
 {
	volume--;
 }

}