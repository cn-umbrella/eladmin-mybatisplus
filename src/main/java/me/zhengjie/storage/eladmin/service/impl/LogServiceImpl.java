package me.zhengjie.storage.eladmin.service.impl;

import me.zhengjie.storage.eladmin.entity.Log;
import me.zhengjie.storage.eladmin.mapper.LogMapper;
import me.zhengjie.storage.eladmin.service.ILogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 张俊辉
 * @since 2019-01-11
 */
@Service
public class LogServiceImpl extends ServiceImpl<LogMapper, Log> implements ILogService {

}
