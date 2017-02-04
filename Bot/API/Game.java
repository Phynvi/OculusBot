package Bot.API;

/**
 * Created by Vik on 23/01/2017.
 */
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.List;
/**
 * Basic game image methods.
 *
 * @Author Ramy
 */
public class Game {

    public static final Color ENERGY_ENABLED = new Color(252, 219, 1);
    public static final Color TAB_OPEN = new Color(254, 239, 114);
    public static final Rectangle ENERGY = new Rectangle(705, 93, 34, 33);
    public static final Rectangle COMPASS = new Rectangle(521, 3, 44, 42);
    public static final Rectangle MAP = new Rectangle(521, 120, 44, 42);
    public static final Rectangle VIEWPORT = new Rectangle(4, 4, 511, 334);

    public static final Rectangle ENERGY_TEXT_BOUNDS = new Rectangle(729, 92,
            32, 39);
    public static final Rectangle PRAYER_TEXT_BOUNDS = new Rectangle(733, 58,
            28, 26);
    public static final Rectangle HP_TEXT_BOUNDS = new Rectangle(719, 19, 27,
            25);

    /**
     * Gets the current run energy
     *
     * @return The run energy
     */
   /* public static int getRunEnergy() {
        String s = RSText.findString(ENERGY_TEXT_BOUNDS, null, null,);
        if (s != null) {
            return Integer.parseInt(s);
        }
        return -1;
    }*/

    /**
     * Toggles the XP on if it's off. Does nothing
     * if it's already on.
     */


    public static boolean isLoggedIn() {
        return ColorUtil.getColor(345, 400).equals(new Color(211, 194, 161));
    }

    public static boolean isLogOutButtonVisible() {
        return ColorUtil.getColor(693, 360).equals(new Color(116, 28, 26));
    }

    /**
     * Gets the current prayer amount
     *
     * @return The current prayer amount
     */
   /* public static int getCurrentPrayer() {
        String s = RSText.findString(PRAYER_TEXT_BOUNDS, null, null);
        if (s != null) {
            return Integer.parseInt(s);
        }
        return -1;
    }*/

    /**
     * gets the runescape view from the gameframe.
     *
     * @return
     */
    public static BufferedImage getViewImage() {
        return ColorUtil.getScreenPart(VIEWPORT);
    }

    /**
     * Gets the current hp amount
     *
     * @return The current amount
     */
    public static String getCurrentHP(BufferedImage img) {
        String s = RSText.findString(HP_TEXT_BOUNDS, null, RSText.grabfontset("StatChars07"),img);
        if (s != null) {
            return (s);
        }
        return"null";
    }

    /**
     * Gets the game image.
     *
     * @return The game image.
     */
    public static BufferedImage getImage() {
        return Screen.getCompleteGameScreen();
    }

    /**
     * Gets the color at a given x-y coordinate on the game image.
     *
     * @param x
     *            The x coordinate.
     * @param y
     *            The y coordinate.
     * @return The color at the given coordinates.
     */
    public static Color getColorAt(final int x, final int y) {
        return ImageUtil.getColorAt(getImage(), x, y);
    }

    /**
     * Gets the color at a given point on the game image.
     *
     * @param p
     *            The point
     * @return The color at the given point.
     */
    public static Color getColorAt(final Point p) {
        return getColorAt(p.x, p.y);
    }

    /**
     * Gets the array of all colors of the game image.
     *
     * @return A two-dimensional array of the colors of the game image.
     */
    public static Color[][] getColors() {
        return ImageUtil.getColors(getImage());
    }

    /**
     * Gets all points within the game image which have a color within threshold
     * distance of a given color.
     *
     * @param color
     *            The color to scan for.
     * @param threshold
     *            The threshold to scan by.
     * @return A list of points where the color of the game image is within the
     *         threshold.
     */
    public static List<Point> getPointsWithColor(final Color color,
                                                 final double threshold) {
        return ImageUtil.getPointsWithColor(Game.getImage(), color, threshold);
    }

    /**
     * Gets all points within the game image which have a color equal to a given
     * color.
     *
     * @param color
     *            The color to scan for.
     * @return A list of points where the color of the game image is equal.
     */
    public static List<Point> getPointsWithColor(final Color color) {
        return getPointsWithColor(color, 0.0);
    }

    /**
     * Gets the size of the game canvas.
     *
     * @return The game's dimension.
     */

    /**
     * Gets whether a point is on the game canvas or not.
     *
     * @param x
     *            he x coordinate.
     * @param y
     *            The y coordinate.
     * @return <tt>true</tt> if valid; otherwise <tt>false</tt>.
     */

    /**
     * Gets whether a point is on the game canvas or not.
     *
     * @param p
     *            The point.
     * @return <tt>true</tt> if valid; otherwise <tt>false</tt>.
     */

    /**
     * Gets the center of the energy toggle button.
     *
     * @return The energy button's center.
     */
    public static Point getEnergyButtonCenter() {
        return new Point((int) (ENERGY.x + (ENERGY.width / 2)),
                (int) (ENERGY.y + (ENERGY.height / 2)));
    }

   /* public static int getEnergy() {
        String s = OCR.getTextAt(ENERGY);
        if (s != null) {
            return Integer.parseInt(s);
        }
        return -1;
    }

    /**
     * Gets the color array of the energy button's display.
     *
     * @return The energy button's colors.
     */
    public static Color[][] getEnergyButtonColors() {
        final Color[][] colors = new Color[ENERGY.width][ENERGY.height];
        for (int x = ENERGY.x; x < ENERGY.x + ENERGY.width; x++) {
            for (int y = ENERGY.y; y < ENERGY.y + ENERGY.height; y++) {
                colors[x][y] = Game.getColors()[x][y];
            }
        }
        return colors;
    }

    /**
     * Checks if run is enabled.
     *
     * @return <tt>true</tt> if enabled; otherwise <tt>false</tt>.
     */
    public static boolean isRunEnabled() {
        for (final Color[] carr : getEnergyButtonColors()) {
            for (final Color c : carr) {
                if (c.equals(ENERGY_ENABLED)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Sets running mode.
     *
     * @param run
     *            <tt>true</tt> to turn run on; <tt>false</tt> to turn it off.
     */

    /**
     * Clicks the game compass.
     */

    /**
     * Opens the world map.
     */

    /**
     * Opens a given tab.
     *
     * @param tabName name of the tab
     * @return <tt>true</tt> if it opens correctly; otherwise <tt>false</tt>
     */


    /**
     * Gets the open tab.
     *
     * @return The open tab.
     */

    /**
     * Experience button.
     */
    public static class Experience {

        public static final Rectangle BOUNDS = new Rectangle(517, 47, 33, 33);
        public static final Rectangle DISPLAY_BOUNDS = new Rectangle(425, 53,
                88, 18);
        public static final Color[] TOGGLE_COLORS = { new Color(255, 255, 255),
                new Color(77, 73, 62), new Color(66, 65, 58) };

        /**
         * Gets the center of the experience button.
         *
         * @return The experience button's center.
         */
        public static Point getCenter() {
            return new Point((int) (BOUNDS.x + (BOUNDS.width / 2)),
                    (int) (BOUNDS.y + (BOUNDS.height / 2)));
        }

        /**
         * Gets the color array of the experience button.
         *
         * @return The experience button's colors.
         */
        public static Color[][] getColors() {
            final Color[][] colors = new Color[BOUNDS.width][BOUNDS.height];
            for (int x = BOUNDS.x; x < BOUNDS.x + BOUNDS.width; x++) {
                for (int y = BOUNDS.y; y < BOUNDS.y + BOUNDS.height; y++) {
                    colors[x][y] = Game.getColors()[x][y];
                }
            }
            return colors;
        }

        /**
         * Gets the color array of the experience button's display.
         *
         * @return The experience button's display colors.
         */
     /*   public static Color[] getDisplayColors() {
            final List<Color> colors = new LinkedList<Color>();
            for (int x = DISPLAY_BOUNDS.x; x < DISPLAY_BOUNDS.x
                    + DISPLAY_BOUNDS.width; x++) {
                for (int y = DISPLAY_BOUNDS.y; y < DISPLAY_BOUNDS.y
                        + DISPLAY_BOUNDS.height; y++) {
                    final Point p = new Point(x, y);
                    if (Game.isPointValid(p)) {
                        colors.add(Game.getColorAt(p));
                    }
                }
            }
            return colors.toArray(new Color[colors.size()]);
        }*/

        /**
         * Checks if the experience button is toggled.
         *
         * @return <tt>true</tt> if toggled; otherwise <tt>false</tt>.
         */

        /**
         * Toggles the experience button on or off.
         *
         * @param toggle
         *            <tt>true</tt> to toggle on; <tt>false</tt> to toggle off.
         */
    }

    /**
     * Money pouch button.
     */

//	/**
//	 * Game tab enumeration.
//	 */
//	public static enum Tab {
//		COMBAT(0, new Rectangle(522, 170, 30, 33)), TASKS(1, new Rectangle(552,
//				170, 30, 33)), SKILLS(2, new Rectangle(582, 170, 30, 33)), QUESTS(
//				3, new Rectangle(612, 170, 30, 33)), INVENTORY(4,
//				new Rectangle(642, 170, 30, 33)), EQUIPMENT(5, new Rectangle(
//				672, 170, 30, 33)), PRAYER(6, new Rectangle(702, 170, 30, 33)), MAGIC(
//				7, new Rectangle(732, 170, 30, 33)), FRIEND_LIST(8,
//				new Rectangle(552, 468, 30, 33)), FRIENDS_CHAT(9,
//				new Rectangle(582, 468, 30, 33)), CLAN_CHAT(10, new Rectangle(
//				612, 468, 30, 33)), OPTIONS(11, new Rectangle(642, 467, 30, 33)), EMOTES(
//				12, new Rectangle(672, 468, 30, 33)), MUSIC(13, new Rectangle(
//				702, 467, 30, 33)), NOTES(14, new Rectangle(732, 467, 30, 33));
//
//		private final int index;
//		private final Rectangle bounds;
//
//		private Tab(final int index, final Rectangle bounds) {
//			this.index = index;
//			this.bounds = bounds;
//		}
//
//		/**
//		 * Gets the tab index.
//		 *
//		 * @return The tab's index.
//		 */
//		public int getIndex() {
//			return index;
//		}
//
//		/**
//		 * Gets the tab bounds.
//		 *
//		 * @return The tab's bounds.
//		 */
//		public Rectangle getBounds() {
//			return bounds;
//		}
//
//		/**
//		 * Gets the tab's center point.
//		 *
//		 * @return The tab's center.
//		 */
//		public Point getCenter() {
//			return new Point(bounds.x + (int) (bounds.width / 2), bounds.y
//					+ (int) (bounds.height / 2));
//		}
//
//		/**
//		 * Gets the tab's color array.
//		 *
//		 * @return The colors of the tab.
//		 */
//		public Color[] getColors() {
//			final List<Color> colors = new LinkedList<Color>();
//			for (int x = bounds.x; x < bounds.x + bounds.width; x++) {
//				for (int y = bounds.y; y < bounds.y + bounds.height; y++) {
//					final Point p = new Point(x, y);
//					if (Game.isPointValid(p)) {
//						colors.add(Game.getColorAt(p));
//					}
//				}
//			}
//			return colors.toArray(new Color[colors.size()]);
//		}
//
//		/**
//		 * Checks if the tab is open.
//		 *
//		 * @return <tt>true</tt> if open; otherwise <tt>false</tt>.
//		 */
//		public boolean isOpen() {
//			for (final Color color : getColors()) {
//				if (color.equals(TAB_OPEN)) {
//					return true;
//				}
//			}
//			return false;
//		}
//
//		/**
//		 * Opens the tab.
//		 */
//		public void open() {
//			if (!isOpen()) {
//				Mouse.click(getCenter(), 6, 6);
//			}
//		}
//
//	}

}
