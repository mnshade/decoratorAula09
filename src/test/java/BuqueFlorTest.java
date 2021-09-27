import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuqueFlorTest {
    @Test
    public void buqueRosasSemDecoracao() {
        BuqueFlor buqueRosas = new BuqueRosas();
        assertEquals("Buque de Rosas", buqueRosas.getDescricao());
        assertEquals(15, buqueRosas.custo());
    }
    @Test
    public void buqueMargaridasSemDecoracao() {
        BuqueFlor buqueMargaridas = new BuqueMargaridas();
        assertEquals("Buque de Margaridas", buqueMargaridas.getDescricao());
        assertEquals(9, buqueMargaridas.custo());
    }
    @Test
    public void buqueRosasComPerfume(){
        BuqueFlor buqueRosasDecorado = new BuqueRosas();
        buqueRosasDecorado = new Perfume(buqueRosasDecorado);
        assertEquals("Buque de Rosas+ perfume", buqueRosasDecorado.getDescricao());
        assertEquals(25, buqueRosasDecorado.custo());
    }

    @Test
    public void buqueMargaridasNoCesto(){
        BuqueFlor buqueMargaridasDecorado = new BuqueMargaridas();
        buqueMargaridasDecorado = new Cesto(buqueMargaridasDecorado);
        assertEquals("Buque de Margaridas+ cesto", buqueMargaridasDecorado.getDescricao());
        assertEquals(34, buqueMargaridasDecorado.custo());
    }

}
