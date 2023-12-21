# waimaiv1
外卖单体1
## 项目启动

前端

```sh
# node版本
v14
# 下载
npm install --registry=https://registry.npmmirror.com
# 启动
npm run dev
```



## 后端

gitignore文件

```sh
# 忽略idea
**/.idea/
```


## 访问

swagger3


## 项目搭建

1. springboot搭建父子项目,web,jpa存储,文档,mysql,验证
2. 加载数据,使用jpa的hibernate先创建schema，然后再导入数据。

// 缓存
https://juejin.cn/post/6844903863821025293

https://www.baeldung.com/spring-boot-evict-cache

```
@Autowired
CacheManager cacheManager;

public void evictSingleCacheValue(String cacheName, String cacheKey) {
    cacheManager.getCache(cacheName).evict(cacheKey);
}

public void evictAllCacheValues(String cacheName) {
    cacheManager.getCache(cacheName).clear();
}
```