package androidsamples.java.dicegames;

import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(MockitoJUnitRunner.class)
public class WalletTest {
    private int[] arr = {1, 2, 4, 4, 5, 3, 2, 3, 6, 6, 6, 6, 2, 3, 3, 5, 5, 3, 2, 4, 4, 2, 1, 1, 3, 4, 6};

    @Mock
    private Die6 die;

    @InjectMocks
    private WalletViewModel vm;

    @Test
    public void total_rolls() {
        for (int i = 0; i < arr.length; i++) {
            when(die.value()).thenReturn(arr[i]);
            vm.rollDie();
        }
        Assert.assertEquals(arr.length, vm.totalRolls());
    }

    @Test
    public void previous_roll() {
        when(die.value()).thenReturn(arr[arr.length - 2]);
        vm.rollDie();
        int x = vm.dieValue();
        when(die.value()).thenReturn(arr[arr.length - 1]);
        vm.rollDie();
        Assert.assertEquals(x, vm.previousRoll());
    }

    @Test
    public void Coins_balance() {
        for (int i = 0; i < arr.length; i++) {
            when(die.value()).thenReturn(arr[i]);
            vm.rollDie();
        }
        Assert.assertEquals((vm.singleSixes() * 5) + (vm.doubleSixes() * 10) - (vm.doubleOthers() * 5), vm.balance());
    }

    @Test
    public void single_sixes() {
        for (int i = 0; i < arr.length; i++) {
            when(die.value()).thenReturn(arr[i]);
            vm.rollDie();
        }
        Assert.assertEquals(2, vm.singleSixes());
    }

    @Test
    public void double_others() {
        for (int i = 0; i < arr.length; i++) {
            when(die.value()).thenReturn(arr[i]);
            vm.rollDie();
        }
        Assert.assertEquals(5, vm.doubleOthers());
    }

    @Test
    public void double_sixes() {
        for (int i = 0; i < arr.length; i++) {
            when(die.value()).thenReturn(arr[i]);
            vm.rollDie();
        }
        Assert.assertEquals(3, vm.doubleSixes());
    }
}