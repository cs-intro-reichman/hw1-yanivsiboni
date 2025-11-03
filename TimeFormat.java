// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		String minutes = "" + args[0].charAt(3) + args[0].charAt(4);
        String suffix;
		if (hours >= 12) {
		 suffix = " PM";
		 } else {
		 suffix = " AM";}
		if (hours > 12) {
			hours = hours - 12;
		}
		System.out.println(hours + ":" + minutes + suffix);
	}
}