package com.qst.test.shop;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import com.qst.mapper.ShopMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.qst.po.Shop;
//import com.qst.mapper.ShopMapper;
import org.junit.jupiter.api.Test;

public class TestShop {


    @Test
    public void test() throws IOException {

        //1读取配置文件
        InputStream inputStream = Resources.getResourceAsStream("shop-config.xml");
        //2 根据配置文件构建sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //3通过sqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();


        // 3模糊查询，根据名字查询
        List<Shop> Shoplist=sqlSession.selectList("selectShopByName","牛奶");

        for(Shop shop:Shoplist){
         System.out.println(shop);
        }

        //4 插入
        Shop Shop = new Shop();
        Shop.setName("矿泉水");
        Shop.setId(24);
        Shop.setPrice(4);
        sqlSession.insert("insertShop", Shop);
        sqlSession.commit();


        //5修改

        Shop.setId(125);
        Shop.setName("士力架");
        sqlSession.update("updateShop", Shop);
        sqlSession.commit();


        //6 删除
       sqlSession.delete("deleteShop", 123);
       sqlSession.commit();


       //7.通过mapper接口实现查找
	   ShopMapper shopMapper= sqlSession.getMapper(ShopMapper.class);

	   Shop shop=  shopMapper.selectShopById(3);
	   System.out.println(shop);


	   //动态查询
        Shop.setName("士力架");
        Shop.setPrice(3);
        List<Shop> ShopList = sqlSession.selectList("ifselectDynamicShop", Shop);
        for (Shop shop1 : ShopList) {
            System.out.println(shop1);
        }

        sqlSession.close();
    }
}
