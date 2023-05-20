package br.ce.wcaquino.matchers;

import br.ce.wcaquino.utils.DataUtils;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
    public void describeTo(Description desc) {
        Date dataEsperada = DataUtils.obterDataComDiferencaDias(qtdDias);
        DateFormat format = new SimpleDateFormat("dd/MM/YYYY");
        desc.appendText(format.format(dataEsperada));
    }
}
