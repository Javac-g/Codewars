import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;

public class Conversion {
    private static final Map<String, String> CONVERSION_MAP = Map.of(
            "kB", "KiB", "KiB", "kB",
            "MB", "MiB", "MiB", "MB",
            "GB", "GiB", "GiB", "GB",
            "TB", "TiB", "TiB", "TB"
    );
    
    public static String memorySizeConversion(String input) {
        String[] parts = input.split(" ");
        BigDecimal value = new BigDecimal(parts[0]);
        String unit = parts[1];
        
        if (!CONVERSION_MAP.containsKey(unit)) {
            throw new IllegalArgumentException("Invalid unit: " + unit);
        }
        
        boolean isBinary = unit.endsWith("iB");
        BigDecimal factor = isBinary ? BigDecimal.valueOf(1000.0 / 1024.0) : BigDecimal.valueOf(1024.0 / 1000.0);
        
        BigDecimal convertedValue = value.multiply(factor).setScale(3, RoundingMode.HALF_UP).stripTrailingZeros();
        String convertedUnit = CONVERSION_MAP.get(unit);
        
        return convertedValue.toPlainString() + " " + convertedUnit;
    }
}
