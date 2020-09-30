package com.yffd.jecap.admin.domain.user.service;

import com.yffd.jecap.admin.domain.user.entity.SysUser;
import com.yffd.jecap.admin.domain.user.repo.ISysUserRepo;
import com.yffd.jecap.common.base.repository.IBaseRepository;
import com.yffd.jecap.common.base.service.AbstractBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserService extends AbstractBaseService<SysUser> {
    @Autowired private ISysUserRepo sysUserRepo;

    @Override
    protected IBaseRepository getRepo() {
        return sysUserRepo;
    }
}
