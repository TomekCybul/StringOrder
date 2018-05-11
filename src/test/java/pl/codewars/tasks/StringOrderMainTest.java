package pl.codewars.tasks;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static pl.codewars.tasks.StringOrderMain.stringOrder;

public class StringOrderMainTest {

    @Test
    public void shouldChangeOrder(){
        String string = "is2 Thi1s T4est 3a";

        assertThat(stringOrder(string)).isEqualTo("Thi1s is2 3a T4est");

    }

    @Test
    public void shouldChangeOrderLonger(){
        String string = "an6d is2 a8ll Thi1s T5est 9words 3a lon4ger check7";

        assertThat(stringOrder(string)).isEqualTo("Thi1s is2 3a lon4ger T5est an6d check7 a8ll 9words");

    }

    @Test
    public void shouldChangeOrderEmpty(){
        String string = "";

        assertThat(stringOrder(string)).isEqualTo("");

    }


}
