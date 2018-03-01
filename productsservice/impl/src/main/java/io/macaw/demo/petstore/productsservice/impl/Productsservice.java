//
//  This file was auto-generated by Macaw tools 0.9.5-Beta8 version built on Tue, 31 Oct 2017 00:05:58 +0530 
//
package io.macaw.demo.petstore.productsservice.impl;

import java.lang.Override;
import java.util.List;

import com.cfx.service.api.config.Configuration;

import io.macaw.db.mysql.utils.DbConnector;
import io.macaw.demo.petstore.productsservice.mysql.db.dto.Supplier;
import io.macaw.demo.petstore.productsservice.mysql.db.dao.CategoryDAO;
import io.macaw.demo.petstore.productsservice.mysql.db.dao.ItemDAO;
import io.macaw.demo.petstore.productsservice.mysql.db.dao.ProductDAO;
import io.macaw.demo.petstore.productsservice.mysql.db.dao.SupplierDAO;
import io.macaw.demo.petstore.productsservice.mysql.db.dto.Category;
import io.macaw.demo.petstore.productsservice.mysql.db.dto.Item;
import io.macaw.demo.petstore.productsservice.mysql.db.dto.Product;

public class Productsservice
		implements com.cfx.service.api.Service, io.macaw.demo.petstore.productsservice.Productsservice {
	Configuration config;
	@Override
	public void initialize(com.cfx.service.api.config.Configuration config)
			throws com.cfx.service.api.ServiceException {
		this.config = config;
	}

	@Override
	public void start(com.cfx.service.api.StartContext startContext) throws com.cfx.service.api.ServiceException {
		DbConnector.initialise();
	}

	@Override
	public void stop(com.cfx.service.api.StopContext stopContext) throws com.cfx.service.api.ServiceException {

	}

	@Override
	public io.macaw.demo.petstore.productsservice.Category addCategory(
			io.macaw.demo.petstore.productsservice.Category category) {
		
		Category dto = new Category();
		dto.setCategoryid(category.getCategoryid());
		dto.setName(category.getName());
		dto.setDescription(category.getDescription());

		try {
			new CategoryDAO().insert(dto);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Exception while adding category",e);
		}
		return category;
	}

	@Override
	public io.macaw.demo.petstore.productsservice.Product addProduct(
			io.macaw.demo.petstore.productsservice.Product product) {
		Product dto = new Product();
		dto.setProductid(product.getProductid());
		dto.setName(product.getName());
		dto.setDescription(product.getDescription());
		dto.setCategory(product.getCategory());
		try {
			new ProductDAO().insert(dto);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Exception while adding product",e);
		}

		return product;
	}

	@Override
	public io.macaw.demo.petstore.productsservice.Item addItem(io.macaw.demo.petstore.productsservice.Item item) {
		Item dto = new Item();

		dto.setItemid(item.getItemid());
		dto.setProductid(item.getProductid());
		dto.setListprice(item.getListprice());
		dto.setUnitcost(item.getUnitcost());
		dto.setSupplierid(item.getSupplierid());
		dto.setStatus(item.getStatus());
		dto.setAttr1(item.getAttr1());
		dto.setAttr2(item.getAttr2());
		dto.setAttr3(item.getAttr3());
		dto.setAttr4(item.getAttr4());
		dto.setAttr5(item.getAttr5());

		try {
			new ItemDAO().insert(dto);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Exception while adding item",e);
		}
		return item;
	}

	@Override
	public io.macaw.demo.petstore.productsservice.Supplier addSupplier(
			io.macaw.demo.petstore.productsservice.Supplier supplier) {

		Supplier dto = new Supplier();
		dto.setSupplierid(supplier.getSupplierid());
		dto.setStatus(supplier.getStatus());
		dto.setName(supplier.getName());
		try {
			new SupplierDAO().insert(dto);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Exception while adding supplier",e);
		}
		return supplier;
	}

	@Override
	public io.macaw.demo.petstore.productsservice.Category updateCategory(
			io.macaw.demo.petstore.productsservice.Category category) {
		Category dto = new Category();
		dto.setCategoryid(category.getCategoryid());
		dto.setName(category.getName());
		dto.setDescription(category.getDescription());

		try {
			new CategoryDAO().update(dto);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Exception while updating category",e);
		}
		return category;
	}

	@Override
	public io.macaw.demo.petstore.productsservice.Product updateProduct(
			io.macaw.demo.petstore.productsservice.Product product) {
		Product dto = new Product();
		dto.setProductid(product.getProductid());
		dto.setName(product.getName());
		dto.setDescription(product.getDescription());
		dto.setCategory(product.getCategory());
		try {
			new ProductDAO().update(dto);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Exception while updating product",e);
		}
		return product;
	}

	@Override
	public io.macaw.demo.petstore.productsservice.Item updateItem(io.macaw.demo.petstore.productsservice.Item item) {
		Item dto = new Item();

		dto.setItemid(item.getItemid());
		dto.setProductid(item.getProductid());
		dto.setListprice(item.getListprice());
		dto.setUnitcost(item.getUnitcost());
		dto.setSupplierid(item.getSupplierid());
		dto.setStatus(item.getStatus());
		dto.setAttr1(item.getAttr1());
		dto.setAttr2(item.getAttr2());
		dto.setAttr3(item.getAttr3());
		dto.setAttr4(item.getAttr4());
		dto.setAttr5(item.getAttr5());

		try {
			new ItemDAO().update(dto);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Exception while updating item",e);
		}
		return item;
	}

	@Override
	public io.macaw.demo.petstore.productsservice.Supplier updateSupplier(
			io.macaw.demo.petstore.productsservice.Supplier supplier) {
		Supplier dto = new Supplier();
		dto.setSupplierid(supplier.getSupplierid());
		dto.setStatus(supplier.getStatus());
		dto.setName(supplier.getName());
		try {
			new SupplierDAO().update(dto);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Exception while updating supplier",e);
		}
		return supplier;

	}

	@Override
	public String deleteCategory(String categoryid) {
		try {
			new CategoryDAO().deleteById(categoryid);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Exception while deleting category",e);
		}
		return null;
	}

	@Override
	public String deleteProduct(String productid) {
		try {
			new ProductDAO().deleteById(productid);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Exception while delete product",e);
		}
		return null;
	}

	@Override
	public String deleteItem(String itemid) {
	try {
			new ItemDAO().deleteById(itemid);
		} catch (Exception e) {
			e.printStackTrace();
		throw new RuntimeException("Exception while deleting item",e);
		}
		return null;

	}

	@Override
	public String deleteSupplier(String supplierid) {

		try {
			new SupplierDAO().deleteById(supplierid);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Exception while deleting supplier",e);
		}
		return null;
	}

	@Override
	public java.util.List<io.macaw.demo.petstore.productsservice.Product> getProductsByCategoryid(String categoryid) {
		return (new ProductDAO().getProductsByCatIdQuery(categoryid));
	}

	@Override
	public io.macaw.demo.petstore.productsservice.Product getProductByProductid(String productid) {
		Product prod = new ProductDAO().findById(productid);
		return new ProductDAO().getEntityFromDTO(prod);
	}

	@Override
	public io.macaw.demo.petstore.productsservice.Item getItemByItemid(String itemid) {
		Item item = new ItemDAO().findById(itemid);
		return new ItemDAO().getEntityFromDTO(item);
	}

	@Override
	public java.util.List<io.macaw.demo.petstore.productsservice.Item> getItemsByProductid(String productid) {
		return (new ItemDAO().getItemsByProductid(productid));
	}

	@Override
	public io.macaw.demo.petstore.productsservice.Supplier getSupplierById(String supplierid) {
		Supplier supplier = new SupplierDAO().findById(supplierid);
		return (new SupplierDAO().getEntityFromDTO(supplier));
	}

	@Override
	public java.util.List<io.macaw.demo.petstore.productsservice.Item> getAllItems() {
		ItemDAO itemDAO = new ItemDAO();
		List<Item> items = itemDAO.findAll();
		return (itemDAO.getEntitiesFromDTOs(items));
	}

	@Override
	public java.util.List<io.macaw.demo.petstore.productsservice.Category> getAllCategories() {
		CategoryDAO categoryDAO = new CategoryDAO();
		List<Category> categories = categoryDAO.findAll();
		return (categoryDAO.getEntitiesFromDTOs(categories));
	}

	@Override
	public java.util.List<io.macaw.demo.petstore.productsservice.Product> getAllProducts() {
		ProductDAO productDAO = new ProductDAO();
		List<Product> products = productDAO.findAll();
		return (productDAO.getEntitiesFromDTOs(products));

	}

	@Override
	public java.util.List<io.macaw.demo.petstore.productsservice.Supplier> getAllSuppliers() {

		SupplierDAO supplierDAO = new SupplierDAO();
		List<Supplier> suppliers = supplierDAO.findAll();
		return (supplierDAO.getEntitiesFromDTOs(suppliers));
	}
}
