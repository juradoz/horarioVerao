package net.danieljurado.horarioVerao;

/*
 * Copyright © 2006 Carlos Duarte do Nascimento (Chester)
 * cd@pobox.com
 *
 * Este programa é um software livre; você pode redistribui-lo e/ou
 * modifica-lo dentro dos termos da Licença Pública Geral GNU como
 * publicada pela Fundação do Software Livre (FSF); na versão 2 da
 * Licença, ou (na sua opnião) qualquer versão.
 *
 * Este programa é distribuido na esperança que possa ser util,
 * mas SEM NENHUMA GARANTIA; sem uma garantia implicita de ADEQUAÇÂO
 * a qualquer MERCADO ou APLICAÇÃO EM PARTICULAR. Veja a Licença
 * Pública Geral GNU para maiores detalhes.
 *
 * Você deve ter recebido uma cópia da Licença Pública Geral GNU
 * junto com este programa, se não, escreva para a Fundação do Software
 * Livre(FSF) Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */

import java.util.Calendar;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

/**
 * Permite que as aplicações Java ajustem o timezone da JVM para o horário de
 * verão do Brasil, de duas formas:
 * <p>
 * - Chamando o método <code>ajustaTimeZone()</code><br>
 * - Trocando a chamada da jvm, passando esta classe (que por sua vez irá chamar
 * a classe original), vide método <code>main</code> abaixo.
 * 
 * @author chester
 */

public class HorarioVerao {

	/**
	 * Timezone para o horário de verão de 2009 Inicio: 18/Out; Fim: 20/Fev;
	 * Hora início: 01h00; Hora fim: 02h00
	 */
	private static TimeZone tz = new SimpleTimeZone(TimeZone.getDefault()
			.getRawOffset(), "America/Sao_Paulo", Calendar.OCTOBER, 18, 0,
			3600000 * 1 + 60000 * 0, // 01h00
			Calendar.FEBRUARY, 21, 0, 3600000 * 2 + 60000 * 0, // 02h00
			3600000);

	/**
	 * Seta o timezone da máquina virtual Java para o nosso timezone customizado
	 */
	public static void ajustaTimeZone() {
		TimeZone.setDefault(tz);
	}
}
