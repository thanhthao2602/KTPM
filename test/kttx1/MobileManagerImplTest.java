/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package kttx1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MobileManagerImplTest {
    private MobileManagerImpl mobileManager;

    @BeforeEach
    public void setUp() {
        mobileManager = new MobileManagerImpl(); // Khởi tạo danh sách mặc định
    }

    @Test
    public void testSortedMobile() {
        // Khởi tạo danh sách cụ thể
        mobileManager = new MobileManagerImpl(0); // Xóa danh sách cũ nếu có
        mobileManager.addMobile(new Mobile(1, "Iphone", 20000, 10, "Black", 6.1));
        mobileManager.addMobile(new Mobile(2, "Samsung", 15000, 15, "White", 5.8));
        mobileManager.addMobile(new Mobile(3, "Oppo", 25000, 12, "Green", 6.5));
        mobileManager.addMobile(new Mobile(4, "Xiaomi", 10000, 8, "Red", 5.7));
        mobileManager.addMobile(new Mobile(5, "Nokia", 18000, 20, "Yellow", 6.0));

        // Gọi phương thức sortedMobile
        List<Mobile> sortedList = mobileManager.sortedMobile(0);

        // Kỳ vọng danh sách đã được sắp xếp
        assertEquals(5, sortedList.size(), "The list should contain 5 items.");
        assertEquals(10000, sortedList.get(0).getProduct_price(), "First item price should be 10000.");
        assertEquals(15000, sortedList.get(1).getProduct_price(), "Second item price should be 15000.");
        assertEquals(18000, sortedList.get(2).getProduct_price(), "Third item price should be 18000.");
        assertEquals(20000, sortedList.get(3).getProduct_price(), "Fourth item price should be 20000.");
        assertEquals(25000, sortedList.get(4).getProduct_price(), "Fifth item price should be 25000.");
    }

