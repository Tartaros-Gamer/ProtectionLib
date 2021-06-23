package de.Ste3et_C0st.ProtectionLib.main.module;

import java.util.HashSet;

import de.Ste3et_C0st.ProtectionLib.main.ProtectionModule;
import de.Ste3et_C0st.ProtectionLib.main.protectionObj;
import de.Ste3et_C0st.ProtectionLib.main.plugins.fPlotSquaredLegacy;

public class PlotSquaredLegacyModule extends ProtectionModule{

	@Override
	public HashSet<Class<? extends protectionObj>> generatePluginMap() {
		HashSet<Class<? extends protectionObj>> protectetionMap = new HashSet<>();
		protectetionMap.add(fPlotSquaredLegacy.class);
		return protectetionMap;
	}
	
}
