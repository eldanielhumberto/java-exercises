import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DartsTest {

    Darts darts = new Darts();

    @Test
    public void missedTarget() {
        assertThat(darts.score(-9, 9)).isEqualTo(0);
    }

    @Test
    public void onTheOuterCircle() {
        assertThat(darts.score(0, 10)).isEqualTo(1);
    }

    @Test
    public void onTheMiddleCircle() {
        assertThat(darts.score(-5, 0)).isEqualTo(5);
    }

    @Test
    public void onTheInnerCircle() {
        assertThat(darts.score(0, -1)).isEqualTo(10);
    }

    @Test
    public void exactlyOnCentre() {
        assertThat(darts.score(0, 0)).isEqualTo(10);
    }

    @Test
    public void nearTheCentre() {
        assertThat(darts.score(-0.1, -0.1)).isEqualTo(10);
    }

    @Test
    public void justWithinTheInnerCircle() {
        assertThat(darts.score(0.7, 0.7)).isEqualTo(10);
    }

    @Test
    public void justOutsideTheInnerCircle() {
        assertThat(darts.score(0.8, -0.8)).isEqualTo(5);
    }

    @Test
    public void justWithinTheMiddleCircle() {
        assertThat(darts.score(-3.5, 3.5)).isEqualTo(5);
    }

    @Test
    public void justOutsideTheMiddleCircle() {
        assertThat(darts.score(-3.6, -3.6)).isEqualTo(1);
    }

    @Test
    public void justWithinTheOuterCircle() {
        assertThat(darts.score(-7.0, 7.0)).isEqualTo(1);
    }

    @Test
    public void justOutsideTheOuterCircle() {
        assertThat(darts.score(7.1, -7.1)).isEqualTo(0);
    }

    @Test
    public void asymmetricPositionBetweenTheInnerAndMiddleCircles() {
        assertThat(darts.score(0.5, -4)).isEqualTo(5);
    }

}
