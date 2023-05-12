package br.ce.wcaquino.matchers;

import br.ce.wcaquino.utils.DataUtils;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
public class DataDiferencaDiasMatcher extends TypeSafeMatcher<Date> {
    private Integer qtdDias;
    @Override
    protected boolean matchesSafely(Date data) {
        return DataUtils.isMesmaData(data, DataUtils.obterDataComDiferencaDias(qtdDias));
    }

    @Override
    public void describeTo(Description description) {

    }
}
