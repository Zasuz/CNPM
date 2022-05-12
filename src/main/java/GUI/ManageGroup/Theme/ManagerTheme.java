package GUI.ManageGroup.Theme;

import com.formdev.flatlaf.FlatLightLaf;

public class ManagerTheme
	extends FlatLightLaf
{
	public static final String NAME = "ManagerTheme";

	public static boolean setup() {
		return setup( new ManagerTheme() );
	}

	public static void installLafInfo() {
		installLafInfo( NAME, ManagerTheme.class );
	}

	@Override
	public String getName() {
		return NAME;
	}
}
