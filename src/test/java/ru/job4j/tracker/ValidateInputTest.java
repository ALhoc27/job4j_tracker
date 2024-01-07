package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ValidateInputTest {

    @Test
    void whenInvalidInput() {
        Output output = new StubOutput();
        ValidateInput input = new ValidateInput(output, new MockInput(new String[] {"one", "1"}));
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    void whenInvalidCorrectInput() {
        Output output = new StubOutput();
        ValidateInput input = new ValidateInput(output, new MockInput(new String[] {"1"}));
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    void whenInvalidMultipleCorrectInput() {
        Output output = new StubOutput();
        String[] arrayExpacted = new String[] {"1", "4", "6"};
        String[] result = new String[arrayExpacted.length];
        ValidateInput input = new ValidateInput(output, new MockInput(arrayExpacted));
        for (int i = 0; i < arrayExpacted.length; i++) {
            result[i] = String.valueOf(input.askInt("Enter menu:"));
        }
        assertThat(arrayExpacted).containsExactly(result);
    }

    @Test
    void whenInvalidMultipleCorrectInputSimple() {
        Output output = new StubOutput();
        String[] arrayExpacted = new String[] {"1", "4", "6"};
        ValidateInput input = new ValidateInput(output, new MockInput(arrayExpacted));
        int selected1 = input.askInt("Enter menu:");
        assertThat(selected1).isEqualTo(1);
        int selected4 = input.askInt("Enter menu:");
        assertThat(selected4).isEqualTo(4);
        int selected6 = input.askInt("Enter menu:");
        assertThat(selected6).isEqualTo(6);
    }

    @Test
    void whenInvalidCorrectInputNegative() {
        Output output = new StubOutput();
        ValidateInput input = new ValidateInput(output, new MockInput(new String[] {"-1"}));
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(-1);
    }

}