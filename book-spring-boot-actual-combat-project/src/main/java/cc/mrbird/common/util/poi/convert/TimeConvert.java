package cc.mrbird.common.util.poi.convert;

import cc.mrbird.common.util.DateUtil;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TimeConvert implements ExportConvert {

    @Override
    public String handler(Object val) {
        try {
            if (val == null)
                return "";
            else {
                return DateUtil.formatCSTTime(val.toString(), "yyyy-MM-dd HH:mm:ss");
            }
        } catch (Exception e) {
            log.error("时间转换异常", e);
            return "";
        }
    }

}
