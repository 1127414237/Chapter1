package dao;

import entity.Provider;

import java.util.List;

public interface ProviderDao {
    int countSum();
    List<Provider> queryProvider();
}
