package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscusshuiyuanxinxiDao;
import com.entity.DiscusshuiyuanxinxiEntity;
import com.service.DiscusshuiyuanxinxiService;
import com.entity.vo.DiscusshuiyuanxinxiVO;
import com.entity.view.DiscusshuiyuanxinxiView;

@Service("discusshuiyuanxinxiService")
public class DiscusshuiyuanxinxiServiceImpl extends ServiceImpl<DiscusshuiyuanxinxiDao, DiscusshuiyuanxinxiEntity> implements DiscusshuiyuanxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusshuiyuanxinxiEntity> page = this.selectPage(
                new Query<DiscusshuiyuanxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscusshuiyuanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusshuiyuanxinxiEntity> wrapper) {
		  Page<DiscusshuiyuanxinxiView> page =new Query<DiscusshuiyuanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusshuiyuanxinxiVO> selectListVO(Wrapper<DiscusshuiyuanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusshuiyuanxinxiVO selectVO(Wrapper<DiscusshuiyuanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusshuiyuanxinxiView> selectListView(Wrapper<DiscusshuiyuanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusshuiyuanxinxiView selectView(Wrapper<DiscusshuiyuanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
