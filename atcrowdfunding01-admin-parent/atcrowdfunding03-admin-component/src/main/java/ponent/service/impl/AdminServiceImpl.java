package ponent.service.impl;

import com.github.pagehelper.PageInfo;
import crowd.entity.Admin;
import crowd.entity.AdminExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ponent.mapper.AdminMapper;
import ponent.service.api.AdminService;

import java.util.List;
@Service
//声明事务
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;
    @Override
    public void saveAdmin(Admin admin) {
        adminMapper.insert(admin);
    }

    @Override
    public Admin queryAdmin(Integer id) {
        return null;
    }

    @Override
    public List<Admin> getAll() {
        return adminMapper.selectByExample(new AdminExample());
    }

    @Override
    public Admin getAdminByUsername(String adminLoginAcct, String adminPassword) {
        return null;
    }

    @Override
    public PageInfo<Admin> getPageInfo(String keyword, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public void removeById(Integer adminId) {

    }

    @Override
    public void updateAdmin(Admin admin) {

    }

    @Override
    public void saveAdminRoleRelationship(Integer adminId, List<Integer> roleList) {

    }

    @Override
    public Admin getAdminByLoginAcct(String loginAcct) {
        return null;
    }
}
