package edu.eci.arsw.saleit.persistence;

import edu.eci.arsw.saleit.model.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface SaleItPersistence {

    void addUser(Usuario user) throws SaleItPersistenceException;

    List<Usuario> getAllUsers() throws SaleItPersistenceException;

    void addAuction(Subasta auction, Integer id) throws SaleItPersistenceException;

    List<Subasta> getAllAuctions() throws SaleItPersistenceException;

    List<Articulo> getAllArticles() throws SaleItPersistenceException;

    void addArticle(Articulo article) throws SaleItPersistenceException;

    List<Categoria> getAllCategories() throws SaleItPersistenceException;

    void addCategory(Categoria category) throws SaleItPersistenceException;

    Optional<Articulo> getArticleById(int id) throws SaleItPersistenceException;

    Usuario getUserById(int id) throws SaleItPersistenceException;

    Optional<Categoria> getCategoryById(int id) throws SaleItPersistenceException;

    List<Subasta> getOwnAuctionsByUser(int id) throws SaleItPersistenceException;

    void addArticleAsFavorite(int user, Articulo article) throws SaleItPersistenceException;

    List<Articulo> getFavoriteArticlesOfAnUser(int user) throws SaleItPersistenceException;

    void makeABid(Puja puja, Integer usuario, Integer subasta) throws SaleItPersistenceException;

    Subasta getAuctionByID(int id) throws SaleItPersistenceException;

    List<Puja> getBidsByAuction(Integer subasta) throws SaleItPersistenceException;
    List<Subasta> getAuctionsOfAnUser(int user) throws SaleItPersistenceException;
}
