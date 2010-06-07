package net.danieljurado.horarioVerao;

/*
 * Copyright � 2006 Carlos Duarte do Nascimento (Chester)
 * cd@pobox.com
 *
 * Este programa � um software livre; voc� pode redistribui-lo e/ou
 * modifica-lo dentro dos termos da Licen�a P�blica Geral GNU como
 * publicada pela Funda��o do Software Livre (FSF); na vers�o 2 da
 * Licen�a, ou (na sua opni�o) qualquer vers�o.
 *
 * Este programa � distribuido na esperan�a que possa ser util,
 * mas SEM NENHUMA GARANTIA; sem uma garantia implicita de ADEQUA��O
 * a qualquer MERCADO ou APLICA��O EM PARTICULAR. Veja a Licen�a
 * P�blica Geral GNU para maiores detalhes.
 *
 * Voc� deve ter recebido uma c�pia da Licen�a P�blica Geral GNU
 * junto com este programa, se n�o, escreva para a Funda��o do Software
 * Livre(FSF) Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */

import java.util.Calendar;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

/**
 * Permite que as aplica��es Java ajustem o timezone da JVM para o hor�rio de
 * ver�o do Brasil, de duas formas:
 * <p>
 * - Chamando o m�todo <code>ajustaTimeZone()</code><br>
 * - Trocando a chamada da jvm, passando esta classe (que por sua vez ir� chamar
 * a classe original), vide m�todo <code>main</code> abaixo.
 * 
 * @author chester
 */

public class HorarioVerao {

	/**
	 * Timezone para o hor�rio de ver�o de 2009 Inicio: 18/Out; Fim: 20/Fev;
	 * Hora in�cio: 01h00; Hora fim: 02h00
	 */
	private static TimeZone tz = new SimpleTimeZone(TimeZone.getDefault()
			.getRawOffset(), "America/Sao_Paulo", Calendar.OCTOBER, 18, 0,
			3600000 * 1 + 60000 * 0, // 01h00
			Calendar.FEBRUARY, 21, 0, 3600000 * 2 + 60000 * 0, // 02h00
			3600000);

	/**
	 * Seta o timezone da maquina virtual Java para o nosso timezone customizado
	 */
	public static void ajustaTimeZone() {
		TimeZone.setDefault(tz);
	}
}
