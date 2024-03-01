package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.assertj.core.api.Assertions.assertThat;

class BishopBlackTest {

    @Test
    public void testPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        Cell cell = Cell.C8;
        assertThat(bishopBlack.position().equals(cell)).isEqualTo(true);
    }

    @Test
    public void testCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        Cell newCell = Cell.F5;
        Figure copy = bishopBlack.copy(newCell);
        assertThat(copy.position().equals(newCell)).isEqualTo(true);
    }

/*    @Test
    public void testWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        Cell dest = Cell.F5;
        Cell[] actualSteps = bishopBlack.way(dest);
        Cell[] expectedSteps = {Cell.D7, Cell.E6, Cell.F5};

        for (int i = 0; i < expectedSteps.length; i++) {
            assertThat(expectedSteps[i]).isEqualTo(actualSteps[i]);
        }
    }*/
}