package androidsamples.java.dicegames;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import android.app.Fragment;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import com.robotium.solo.Solo;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class WalletInstrumentedTest {
    @Rule
    public ActivityScenarioRule<WalletActivity> activityRule = new ActivityScenarioRule<>(WalletActivity.class);
    public Fragment f = new Fragment();
    private Solo solo = new Solo(InstrumentationRegistry.getInstrumentation(), f.getActivity());


    @Test
    public void Screen1() {
        solo.setActivityOrientation(Solo.PORTRAIT);
        for (int i = 0; i < 10; i++) {
            onView(withId(R.id.btn)).perform(click());
        }
        solo.setActivityOrientation(Solo.LANDSCAPE);
        onView(withId(R.id.tdr1)).check(matches(withText("10")));
    }

    @Test
    public void Screen2() {
        solo.setActivityOrientation(Solo.PORTRAIT);
        for (int i = 0; i < 40; i++) {
            onView(withId(R.id.btn)).perform(click());
        }
        solo.setActivityOrientation(Solo.LANDSCAPE);
        onView(withId(R.id.tdr1)).check(matches(withText("40")));
    }

    @Test
    public void Screen3() {
        solo.setActivityOrientation(Solo.PORTRAIT);
        for (int i = 0; i < 30; i++) {
            onView(withId(R.id.btn)).perform(click());
        }
        solo.setActivityOrientation(Solo.LANDSCAPE);
        onView(withId(R.id.tdr1)).check(matches(withText("30")));
    }

    @Test
    public void Screen4() {
        solo.setActivityOrientation(Solo.PORTRAIT);
        for (int i = 0; i < 40; i++) {
            onView(withId(R.id.btn)).perform(click());
        }
        solo.setActivityOrientation(Solo.LANDSCAPE);
        onView(withId(R.id.tdr1)).check(matches(withText("40")));
    }

    @Test
    public void Screen5() {
        solo.setActivityOrientation(Solo.PORTRAIT);
        for (int i = 0; i < 40; i++) {
            onView(withId(R.id.btn)).perform(click());
        }
        solo.setActivityOrientation(Solo.LANDSCAPE);
        onView(withId(R.id.tdr1)).check(matches(withText("40")));
    }
}