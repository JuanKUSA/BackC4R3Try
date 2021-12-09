/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catalogo_CangrejoWeb.CatalogoCangrejoWeb.repositorio;
import Catalogo_CangrejoWeb.CatalogoCangrejoWeb.interfaces.InterfaceOrder;
import Catalogo_CangrejoWeb.CatalogoCangrejoWeb.modelo.Order;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Juan Valero
 */
@Repository
public class OrderRepository {
    
    @Autowired
    private InterfaceOrder interfaceorder;

    public List<Order> getAll() {
        return (List<Order>) interfaceorder.findAll();
    }

    public Optional<Order> getOrder(int id) {
        return interfaceorder.findById(id);
    }

    public Order create(Order order) {
        return interfaceorder.save(order);
    }

    public void update(Order order) {
        interfaceorder.save(order);
    }

    public void delete(Order order) {
        interfaceorder.delete(order);
    }

    public Optional<Order> lastUserId(){
        return interfaceorder.findTopByOrderByIdDesc();
    }

    public List<Order> findByZone(String zone) {
        return interfaceorder.findByZone(zone);
    }
}
