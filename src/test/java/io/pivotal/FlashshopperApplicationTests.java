package io.pivotal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.StubTrigger;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FlashshopperApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	StubTrigger stubTrigger;

//	@Test
//	public void testWithV2StubData() {
//		int initialSize = this.githubDataListener.stats.get();
//
//		this.stubTrigger.trigger("issue_created_v2");
//
//		then(this.githubDataListener.counter).isNotEmpty();
//		then(this.githubDataListener.stats.get()).isGreaterThan(initialSize);
//	}

	/**
	 *  API v1
	 */

	// API v1
//	@Test
//	public void accept() {
//		// given
//		Item item = new Item("Beyonce", 5);
//		//when
//		InventoryItemInfo itemInfo = service.getItemInfo(item);
//		//then
//		assertThat(itemInfo.getStatus())
//				.isEqualTo(InventoryItemInfo.STATUS_ACCEPTED);
//		assertThat(itemInfo.getRejectionReason()).isEqualTo("NO_REASON");
//		assertThat(itemInfo.getPrice() = 130);
//	}

	// API v1
//	@Test
//	public void rejectEventUnavailable() {
//		// given
//		Item item = new Item("Beyonx", 5);
//		//when
//		InventoryItemInfo itemInfo = service.getItemInfo(item);
//		//then
//		assertThat(itemInfo.getStatus())
//				.isEqualTo(InventoryItemInfo.STATUS_REJECTED);
//		assertThat(itemInfo.getRejectionReason()).isEqualTo("ITEM_NOT_AVAILABLE");
//	}

	// API v1
//	@Test
//	public void rejectQuantityOutOfBounds() {
//		// given
//		Item item = new Item("Beyonce", 50);
//		//when
//		InventoryItemInfo itemInfo = service.getItemInfo(item);
//		//then
//		assertThat(itemInfo.getStatus())
//				.isEqualTo(InventoryItemInfo.STATUS_REJECTED);
//		assertThat(itemInfo.getRejectionReason()).isEqualTo("QUANTITY_OUT_OF_BOUNDS");
//	}

	/**
	 *  API v2
	 */

	// API v2
//	@Test
//	public void accept() {
//		// given
//		Item item = new Item("Beyonce", 5, 100);
//		//when
//		InventoryItemInfo itemInfo = service.getItemInfo(item);
//		//then
//		assertThat(itemInfo.getStatus())
//				.isEqualTo(InventoryItemInfo.STATUS_ACCEPTED);
//		assertThat(itemInfo.getRejectionReason()).isEqualTo("NO_REASON");
//		assertThat(itemInfo.getPrice() = 80);
//	}

	// API v2
//	@Test
//	public void rejectEventUnavailable() {
//		// given
//		Item item = new Item("Beyonx", 5, 100);
//		//when
//		InventoryItemInfo itemInfo = service.getItemInfo(item);
//		//then
//		assertThat(itemInfo.getStatus())
//				.isEqualTo(InventoryItemInfo.STATUS_REJECTED);
//		assertThat(itemInfo.getRejectionReason()).isEqualTo("ITEM_NOT_AVAILABLE");
//	}

	// API v2
//	@Test
//	public void rejectQuantityOutOfBounds() {
//		// given
//		Item item = new Item("Beyonce", 5, 100);
//		//when
//		InventoryItemInfo itemInfo = service.getItemInfo(item);
//		//then
//		assertThat(itemInfo.getStatus())
//				.isEqualTo(InventoryItemInfo.STATUS_REJECTED);
//		assertThat(itemInfo.getRejectionReason()).isEqualTo("PRICE_TOO_LOW");
//	}

	// API v2
//	@Test
//	public void rejectQuantityOutOfBounds() {
//		// given
//		Item item = new Item("Beyonce", 5, 100);
//		//when
//		InventoryItemInfo itemInfo = service.getItemInfo(item);
//		//then
//		assertThat(itemInfo.getStatus())
//				.isEqualTo(InventoryItemInfo.STATUS_REJECTED);
//		assertThat(itemInfo.getRejectionReason()).isEqualTo("PRICE_TOO_LOW");
//	}

}
